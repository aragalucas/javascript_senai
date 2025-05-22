from negocio_estoque import adicionar_item, listar_itens, alterar_item

def exibir_menu():
    while True:
        print("\n=== Sistema de Gerenciamento de Estoque ===")
        print("1. Adicionar item")
        print("2. Listar itens")
        print("3. Alterar item")
        print("4. Sair")
        
        opcao = input("Escolha uma opção: ")
        
        if opcao == "1":
            adicionar_item()
        elif opcao == "2":
            listar_itens()
        elif opcao == "3":
            alterar_item()
        elif opcao == "4":
            print("Saindo do sistema...")
            break
        else:
            print("Opção inválida. Tente novamente.")

if __name__ == "__main__":
    exibir_menu()

from tkinter import *
menu_inicial = Tk()
menu_inicial.title ("sistema de controle de estoque")
menu_inicial.geometry("400x400x500x100")
menu_inicial.minsize(350, 350)
menu_inicial.maxsize(500, 500)
menu_inicial.resizable(False, False)
menu_inicial.state("iconic")


menu_inicial.mainloop()
