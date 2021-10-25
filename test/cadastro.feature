#language:pt
Funcionalidade: Cadastro de usuário
    O usuário deve ser capaz de conseguir se cadastrar no sistema com suas informações caso não possua login no mesmo.
    
    Contexto:
        Dado: que não tenho um login no sistema
        E pressiono o botão de cadastro de usuário
    Cenário: Cadastro realizado com sucesso
        Quando preencho os dados necessários para o cadastro
        E coloco um email que não tem cadastro no sistema
        E coloco uma senha válida
        E confirmo essa senha
        E clico para cadastrar
        Então o sistema cadastra o usuário com sucesso
        E exibe uma tela informando que "O cadastro foi realizado com sucesso".

    Cenário: Email não informado
        Quando não preencho todos os dados necessários para o cadastro
        E não coloco um Email
        E coloco uma senha válida
        E confirmo essa senha
        E clico em cadastrar
        Então o sistema não cadastra o usuário
        E exibe uma tela informando que "O email não foi informado" no momento do cadastro.

    Cenário: Senha não informada      
        Quando preencho os dados necessários para o cadastro
        E coloco um email que não tem cadastro no sistema
        E não coloco uma senha válida
        E não confirmo a mesma senha
        E clico em cadastrar
        Então o sistema não cadastra o usuário
        E exibe uma tela informando que "A senha não foi informada" no momento do cadastro.

    Cenário: Senha divergente
        Quando preencho os dados necessários para o cadastro
        E coloco um email que não tem cadastro no sistema
        E coloco uma senha válida
        E não confirmo a mesma Senha
        E clico em cadastrar
        Então o sistema não cadastra o usuário
        E exibe uma tela informando que "As senhas divergem" no momento do cadastro.   

    Cenário: Nenhum campo preenchido
        Quando não preencho nenhum dos dados necessários para o cadastro
        E não coloco um email que não tem cadastro no sistema
        E não coloco uma senha válida
        E não confirmo a mesma Senha
        E clico em cadastrar
        Então o sistema não cadastra o usuário
        E exibe uma tela informando que "Existem campos que não foram preenchidos" no momento do cadastro.        
