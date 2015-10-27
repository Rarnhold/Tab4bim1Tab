# 27/10/2015 iniciando o smoke

Smoke � uma loja de artigos esportivos e narguile



----------------------Afazeres do Trabalho-------------
Criar uma PoC de um sistema de vendas em Java. ok!

Cadastro de cliente: Id, nome, telefone, endere�o, cidade, estado (enum), email, g�nero (enum). OK!

Cadastro de usu�rio:

Id, id de cliente e senha.

Todo usu�rio � um cliente, mas ele possui uma senha. Logo para se ter um usu�rio deve-se cadastrar um cliente antes e referenci�-lo no cadastro de usu�rios.

Cadastro de produto:

Id, c�digo de barras, categoria (LIMPEZA, PE�AS, ALIMENTA��O, ETC), descri��o, unidade (KG, UN, PCT, CX), custo (BigDecimal) e margem de lucro (BigDecimal).

BigDecimal deve ser utilizado para valores monet�rios. Nunca deve-se utilizar float e Double para valores monet�rios por causa de erros de arredondamento por ponto flutuante em valores fracion�rios.

Tela de vendas:

Sele��o do cliente, dos produtos, sistema informa valor total da compra, usu�rio informa valor do pagamento e sistema informa troco. O sistema deve ainda armazenar data e hora da finaliza��o da compra. Os dados de venda devem ser redundantes, ou seja, n�o podem referenciar o cadastro de produtos nem o de cliente. Uma venda � um fato acontecido e ao alterar um dado nos cadastros n�o deve ter altera��o no hist�rico de vendas.


Relat�rios em PDF usando Jasper Reports:

Cliente: filtros por estado, cidade.

Produto: filtros por categoria e por margem de lucro (ex: > 20%).

Vendas: por dia, por m�s, por categoria de produto e por cliente.

Regras gerais:

Tela principal em Swing. Usar JMenuBar para as funcionalidades. Abrir telas de cadastro e filtros de relat�rios em abas no centro da tela principal. O sistema deve solicitar usu�rio e senha ao iniciar. Os relat�rios devem ser exportados em PDF e abrir automaticamente com o visualizador padr�o de PDF do sistema operacional. As telas de cadastro e de vendas devem possuir um JTable na parte inferior contendo os registros j� gravados, ao clicar (duplo) no item da JTable ele deve ser carregado para edi��o.

Os cadastros devem permitir a exclus�o dos registros, bem como altera��o.

O projeto deve ser Maven e a persist�ncia em um banco relacional (MySQL ou Postgres).

Fazer testes unit�rios com JUnit para todas as funcionalidades de cadastro, venda e relat�rio (�ureo).

Colocar junto no c�digo script SQL para cria��o das tabelas e script SQL para carregamento dos dados padr�o.

Deve haver coment�rio em todas classes dizendo para o que ela serve, nome do autor, data e hora de cria��o.

Avalia��o:

�Commits no Github. Um por t�rmino de m�todo. Se for um commit somente ou somente nos dois �ltimos dias entrega, o aluno recebe nota zero. Eles devem ser constantes do in�cio ao fim.

�Primeiro commit dia 27 de outubro de 2015.

�Padr�es de projeto utilizado.

�Usabilidade.


Importante: nome do reposit�rio pode ser qualquer coisa, mas dentro dele s� deve haver os arquivos do trabalho. O nome do sistema depende da criatividade do aluno.

