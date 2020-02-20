CREATE TABLE LÅNELISTE (
låneid INT,
personnummer DECIMAL(11, 0),
bokid INT,
lånedato VARCHAR(20),
levertdato VARCHAR(20),
PRIMARY KEY (`låneid`),
CONSTRAINT personnummerFK FOREIGN KEY (personnummer)
REFERENCES personer(personnummer),
CONSTRAINT bokIdFK FOREIGN KEY (bokid)
REFERENCES bøker(bokId)

);