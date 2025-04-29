const cadastrarUsuario = () => {
    const nome = document.getElementById('nome').value
    const email = document.getElementById('email').value
    const senha = document.getElementById('senha').value
    const mensagem = document.getElementById('mensagem').value   

    fetch ('https://localhost:8080/usuarios', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ nome, email, senha})    
})
.then(response => response.json().then(data => ({ status: response.status, body: data})))
.then(({ status, body }) = {
    if (status >= 400) {
        let erroMensagem = body.mensagem
    }
    if (body.erros) {
        erroMensagem += ' ' + Object.values(body.eros).join(', ')
    }
     mensagem.textContent = erroMensagem
     mensagem.classList.remove('sucesso')
     mensagem.classList.add('erro', 'visivel')
} else {
    mensagem.textContent = body.mensagem || "usuario cadasteado com sucesso! "
    mensagem.classList.remove('erro')
    mensagem.add('sucesso', 'visivel')

    document.getElementById('cadastroform').rest
}
    exibirMensagem()
})
.catch{() => {
    mensagem.textContent = 'Erro ao conecta ao servidor'
    mensagem.classList.remove('sucesso')
    mensagem.classList.add('erro', 'visivel')
    exibirMensagem()
})
}

