CREATE TABLE PERSONER (
personnummer DECIMAL(11,0),
fornavn VARCHAR(30),
etternavn VARCHAR(60),
gatenavn VARCHAR(60),
husnummer INT,
postnummer INT,
PRIMARY KEY (`personnummer`),
CONSTRAINT postnummerFK FOREIGN KEY (postnummer)
REFERENCES postnummer(postnummer)
);
