def adicionar_item():
    codigo = input("Digite o código do item: ")
    descricao = input("Digite a descrição do item: ")
    fabricante = input("Digite o fabricante do item: ")
    preco = input("preco: ")

    with open("estoque.txt", "a") as arquivo:
        arquivo.write(f"{codigo},{descricao},{fabricante},{preco}\n")
    print("Item adicionado com sucesso!")
def listar_itens():
    try:
        with open("estoque.txt", "r") as arquivo:
            print("Código\tDescrição\tFabricante\tPreço")
            for linha in arquivo:
                codigo, descricao, fabricante, preco = linha.strip().split(",")
                print(f"{codigo}\t{descricao}\t{fabricante}\t{preco}")
    except FileNotFoundError:
        print("Nenhum item encontrado no estoque.")
def alterar_item():
    codigo = input("Digite o código do item a ser alterado: ")
    encontrado = False
    with open("estoque.txt", "r") as arquivo:
        linhas = arquivo.readlines()
    with open("estoque.txt", "w") as arquivo:
        for linha in linhas:
            if linha.startswith(codigo):
                encontrado = True
                descricao = input("Digite a nova descrição do item: ")
                fabricante = input("Digite o novo fabricante do item: ")
                preco = input("Digite o novo preço do item: ")
                arquivo.write(f"{codigo},{descricao},{fabricante},{preco}\n")
            else: 
                arquivo.write(linha)
    if encontrado:
        print("Item alterado com sucesso!")
    else:
        print("Item não encontrado.")