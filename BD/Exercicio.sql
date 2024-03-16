CREATE DATABASE exercicio1;

USE exercicio1;

CREATE TABLE VENDEDOR (
nrvendedor TINYINT PRIMARY KEY,
nomevendedor VARCHAR(100),
idade TINYINT,
salario DECIMAL(10, 2)
);

CREATE TABLE PEDIDO (
nr_pedido TINYINT PRIMARY KEY,
nrvendedor TINYINT,
nrcliente TINYINT,
quantidade_itens TINYINT,
valor_total DECIMAL(10, 2),
FOREIGN KEY (nrvendedor) REFERENCES VENDEDOR(nrvendedor),
FOREIGN KEY (nrcliente) REFERENCES CLIENTE(nrcliente)
);

CREATE TABLE CLIENTE (
nrcliente TINYINT PRIMARY KEY,
nomecliente VARCHAR(100),
cidade VARCHAR(100),
tipo VARCHAR(50)
);

INSERT INTO VENDEDOR (nrvendedor, nomevendedor, idade, salario) VALUES
(6, 'Rafaela Lima', 30, 3200.00),
(7, 'Fernanda Costa', 35, 3800.00),
(8, 'Gustavo Santos', 28, 3000.00),
(9, 'Camila Oliveira', 32, 3500.00),
(10, 'Lucas Pereira', 40, 4000.00);

INSERT INTO VENDEDOR (nrvendedor, nomevendedor, idade, salario) VALUES
(4, 'João Silva', 30, 3200.00);

INSERT INTO CLIENTE (nrcliente, nomecliente, cidade, tipo) VALUES
(6, 'Indústria XYZ', 'São Paulo', 'INDÚSTRIA'),
(7, 'Comércio ABC', 'Rio de Janeiro', 'COMÉRCIO'),
(8, 'Serviços 123', 'Belo Horizonte', 'SERVIÇOS'),
(9, 'Indústria LMN', 'Porto Alegre', 'INDÚSTRIA'),
(10, 'Comércio DEF', 'Curitiba', 'COMÉRCIO');

INSERT INTO PEDIDO (nr_pedido, nrvendedor, nrcliente, quantidade_itens, valor_total) VALUES
(116, 6, 6, 40, 6000.00),
(117, 7, 7, 25, 4500.00),
(118, 8, 8, 18, 2700.00),
(119, 9, 9, 35, 7000.00),
(120, 10, 10, 30, 5500.00);

SELECT nomevendedor FROM VENDEDOR;

SELECT DISTINCT nrvendedor FROM PEDIDO;

SELECT nrvendedor FROM VENDEDOR WHERE nrvendedor NOT IN (SELECT DISTINCT nrvendedor FROM PEDIDO);

SELECT DISTINCT V.nomevendedor FROM VENDEDOR V INNER JOIN PEDIDO P ON V.nrvendedor = P.nrvendedor 
INNER JOIN CLIENTE C ON P.nrcliente = C.nrcliente WHERE C.tipo = 'INDÚSTRIA';

SELECT DISTINCT C.tipo FROM VENDEDOR V INNER JOIN PEDIDO P ON V.nrvendedor = P.nrvendedor 
INNER JOIN CLIENTE C ON P.nrcliente = C.nrcliente WHERE V.nomevendedor = 'João Silva';

SELECT DISTINCT C.nomecliente, C.tipo FROM PEDIDO P 
INNER JOIN CLIENTE C ON P.nrcliente = C.nrcliente WHERE P.valor_total > 5000;

CREATE DATABASE exercicio2;

USE exercicio2; 

CREATE TABLE ALUNO (
aluno_id TINYINT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(100),
curso VARCHAR(100),
nivel VARCHAR(50),
idade TINYINT
);

CREATE TABLE TURMA (
turma_id TINYINT AUTO_INCREMENT PRIMARY KEY,
nometurma VARCHAR(100),
sala VARCHAR(50),
horario VARCHAR(50)
);

CREATE TABLE MATRICULA (
matricula_id TINYINT AUTO_INCREMENT PRIMARY KEY,
aluno_id TINYINT,
turma_id TINYINT,
nota_1 TINYINT,
nota_2 TINYINT,
nota_3 TINYINT,
nota_final TINYINT,
nr_faltas TINYINT,
FOREIGN KEY (aluno_id) REFERENCES ALUNO(aluno_id),
FOREIGN KEY (turma_id) REFERENCES TURMA(turma_id)
);

SELECT nome FROM ALUNO;
