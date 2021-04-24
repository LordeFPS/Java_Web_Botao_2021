CREATE TABLE contato (
  id bigint(20) UNSIGNED NOT NULL,
  nome varchar(50) NOT NULL,
  fone varchar(16) DEFAULT NULL,
  email varchar(200) NOT NULL,
  observacao tinytext DEFAULT NULL,
  data_cadastro datetime DEFAULT now()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;