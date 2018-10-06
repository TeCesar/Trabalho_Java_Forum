# Trabalho_Java_Forum
Imagine que você possuí uma empresa prestadora de serviços que atua nos mais diversos segmentos, tais como:
- Segurança física
- Limpeza
- Manutenção
- Desenvolvimento de Software
- Infraestrutura de redes
- etc...

A sua empresa fornece uma plataforma online onde os clientes podem tirar duvidas sobre os servicos prestados bem como criar discussoes sobre os mais diversos topicos.

Existem quatro niveis de acesso diferentes:
1 - Administrador
2 - Operador
3 - Cliente
4 - Usuario

Administrador
1 - Como um administrador do sistema eu quero manter um operador a fim de gerenciar os operados do sistema. (A senha padrão será 12345)
2 - Como um administrador do sistema eu quero ter acesso a todos os relatórios do operador incluind os relatórios de administração para ter a visão administrativa do sistema.
1 - Log de acesso.
2 - Ações.
3 - Tempo de duração da escrita de cada tópico ou ticket.
4 - Tentativas erradas de login.
5 - Usuários bloqueados.
6 - Quantidade de tickets resolvidos por operador.

3 - Como um administrador do sistema eu quero poder editar a resposta de um operador e para toda resposta editada deve constar a data de edição da resposta.

Operador
1 - Como um operador do sistema eu quero manter empresas a fim de gerenciar as empresas onde meus clientes trabalham e poder agrupar clientes por empresas.
1 - Como um operador do sistema eu quero manter clientes a fim de gerenciar os clientes do meu sistema (A senha padrão será 12345).
É importante notar que no momento do cadastro se a empresa do cliente não estiver cadastrada primeiramente é necessário cadastrar a empresa do cliente para depois relacionar o cliente à empresa.
2 - Como um operador do sistema eu quero poder responder um ticket a fim de sanar as dúvidas do cliente.
3 - Como um operador do sistema eu quero poder responder um tópico a fim de participar da discussão e tentar contribuir para a dúvida do usuário.
4 - Como um operador do sistema eu quero ter acesso a relatórios a fim de acompanhar a interação dos clientes e usuários dentro do sistema:
1 - Lista de clientes por empresa.
2 - Lista de usuários.
3 - Quantidade de tickets por cliente.
4 - Quantidade de tickets sem resposta por cliente.
5 - Lista de tickets sem resposta por cliente. (Esse relatório da a opção de clicar em um link "Responder", para cada ticket.)
6 - Quantidade de tickets resolvidos por cliente.
7 - Quantidade de tickets reabertos por cliente.
8 - Quantidade de tópicos por usuário.
9 - Quantidade de tópicos sem resposta.
10 - Quantidade de tópicos marcados como resolvidos.

Cliente
1 - Como um cliente do sistema eu quero criar um ticket a fim de sanar minhas dúvidas.
2 - Como um cliente do sistema eu quero assinalar um ticket como resolvido a fim de alertar que minha dúvida foi satisfatóriamente respondida.
3 - Como um cliente do sistema eu quero listar todos os tickets que minha empresa tem em aberto a fim de acompanhar as respostas.
4 - Como um cliente do sistema eu quero listar todos os meus tickets que já foram resolvidos a fim de poder verificar as soluções dadas. (Essa listagem da a opção de visualizar o ticket ou reabrir).
5 - Como um cliente do sistema eu quero reabrir um ticket que já foi marcado como resolvido a fim de postar mais uma pergunta.
6 - Como um cliente do sistema eu quero listar os tópicos abertos a fim de participar da discussão e tentar contribuir com a dúvida do usuário.

Usuário
1 - Como um usuário do sistema eu gostaria de criar um novo tópico para discussão.
2 - Como um usuário do sistema eu gostaria de listar os tópicos abertos para discussão a fim de entrar no tópico e poder responde-lo.


Requisitos Gerais:
1 - O usuário admin deve ser inserido diretamente na base de dados.
2 - Operadores, Clientes e Usuários no primeiro acesso devem ser redirecionados para uma página onde a troca de senha deve ser requisitada.
3 - Quando um usuário, cliente ou operador postarem alguma mensagem, deve existir algo que identifique seu perfil dentro do sistema (usuário, cliente ou operador).
Ex: Abaixo do nome podemos adicionar o identificador "CL", "OP" e "US" ou mudar a cor do nome de cada um deles.
