CREATE TABLE LÅNELISTE (
låneid INT,
personnummer DECIMAL(11, 0),
bokid INT,
lånedato INT,
levertdato INT,
PRIMARY KEY (`låneid`),
CONSTRAINT personnummerFK FOREIGN KEY (personnummer)
REFERENCES personer(personnummer),
CONSTRAINT bokIdFK FOREIGN KEY (bokid)
REFERENCES bøker(bokId)

);