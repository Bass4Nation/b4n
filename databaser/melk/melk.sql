CREATE TABLE kunder (
	id INT AUTO_INCREMENT,
    navn VARCHAR(45),
    PRIMARY KEY (id)
    );
    
CREATE TABLE produkter (
	id INT AUTO_INCREMENT,
    navn VARCHAR(45),
    pris INT,
    PRIMARY KEY (id)
    );
    
CREATE TABLE transaksjoner (
	id INT AUTO_INCREMENT,
    kundeid INT,
    produktId INT,
    antall INT,
    dato DATE,
    PRIMARY KEY(id)
    );
    
INSERT INTO kunder VALUES (0,"Rema");
INSERT INTO kunder VALUES (0,"Rimi");
INSERT INTO kunder VALUES (0,"Kiwi");
INSERT INTO kunder VALUES (0,"Meny");

INSERT INTO produkter VALUES (0,"H-melk",10);
INSERT INTO produkter VALUES (0,"Lettmelk",9);
INSERT INTO produkter VALUES (0,"Skummet melk",15);

INSERT INTO transaksjoner VALUES (0,1,1,40,"2020-01-31");
INSERT INTO transaksjoner VALUES (0,2,1,60,"2020-01-31");
INSERT INTO transaksjoner VALUES (0,3,1,60,"2020-01-31");
INSERT INTO transaksjoner VALUES (0,4,1,10,"2020-01-31");
INSERT INTO transaksjoner VALUES (0,1,2,30,"2020-01-31");
INSERT INTO transaksjoner VALUES (0,2,2,30,"2020-01-20");
INSERT INTO transaksjoner VALUES (0,3,2,30,"2020-01-21");
INSERT INTO transaksjoner VALUES (0,4,2,30,"2020-01-21");
INSERT INTO transaksjoner VALUES (0,1,3,50,"2020-01-31");
INSERT INTO transaksjoner VALUES (0,2,3,10,"2020-01-31");
INSERT INTO transaksjoner VALUES (0,3,3,80,"2020-01-29");
INSERT INTO transaksjoner VALUES (0,4,3,40,"2020-01-29");