CREATE TABLE BØKER (
bokId INT,
tittel VARCHAR(60),
forfatterid DECIMAL(30, 0),
antall INT,
PRIMARY KEY (`bokId`),
CONSTRAINT `forfatterIdFK` FOREIGN KEY (forfatterid)
REFERENCES forfattere(id)
);