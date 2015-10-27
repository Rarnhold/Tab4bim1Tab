# 27/10/2015 iniciando o smoke

Smoke é uma loja de artigos esportivos e narguile



----------------------Afazeres do Trabalho-------------
Criar uma PoC de um sistema de vendas em Java. ok!

Cadastro de cliente: Id, nome, telefone, endereço, cidade, estado (enum), email, gênero (enum). OK!

Cadastro de usuário:

Id, id de cliente e senha.

Todo usuário é um cliente, mas ele possui uma senha. Logo para se ter um usuário deve-se cadastrar um cliente antes e referenciá-lo no cadastro de usuários.

Cadastro de produto:

Id, código de barras, categoria (LIMPEZA, PEÇAS, ALIMENTAÇÃO, ETC), descrição, unidade (KG, UN, PCT, CX), custo (BigDecimal) e margem de lucro (BigDecimal).

BigDecimal deve ser utilizado para valores monetários. Nunca deve-se utilizar float e Double para valores monetários por causa de erros de arredondamento por ponto flutuante em valores fracionários.

Tela de vendas:

Seleção do cliente, dos produtos, sistema informa valor total da compra, usuário informa valor do pagamento e sistema informa troco. O sistema deve ainda armazenar data e hora da finalização da compra. Os dados de venda devem ser redundantes, ou seja, não podem referenciar o cadastro de produtos nem o de cliente. Uma venda é um fato acontecido e ao alterar um dado nos cadastros não deve ter alteração no histórico de vendas.


Relatórios em PDF usando Jasper Reports:

Cliente: filtros por estado, cidade.

Produto: filtros por categoria e por margem de lucro (ex: > 20%).

Vendas: por dia, por mês, por categoria de produto e por cliente.

Regras gerais:

Tela principal em Swing. Usar JMenuBar para as funcionalidades. Abrir telas de cadastro e filtros de relatórios em abas no centro da tela principal. O sistema deve solicitar usuário e senha ao iniciar. Os relatórios devem ser exportados em PDF e abrir automaticamente com o visualizador padrão de PDF do sistema operacional. As telas de cadastro e de vendas devem possuir um JTable na parte inferior contendo os registros já gravados, ao clicar (duplo) no item da JTable ele deve ser carregado para edição.

Os cadastros devem permitir a exclusão dos registros, bem como alteração.

O projeto deve ser Maven e a persistência em um banco relacional (MySQL ou Postgres).

Fazer testes unitários com JUnit para todas as funcionalidades de cadastro, venda e relatório (Áureo).

Colocar junto no código script SQL para criação das tabelas e script SQL para carregamento dos dados padrão.

Deve haver comentário em todas classes dizendo para o que ela serve, nome do autor, data e hora de criação.

Avaliação:

·Commits no Github. Um por término de método. Se for um commit somente ou somente nos dois últimos dias entrega, o aluno recebe nota zero. Eles devem ser constantes do início ao fim.

·Primeiro commit dia 27 de outubro de 2015.

·Padrões de projeto utilizado.

·Usabilidade.


Importante: nome do repositório pode ser qualquer coisa, mas dentro dele só deve haver os arquivos do trabalho. O nome do sistema depende da criatividade do aluno.

