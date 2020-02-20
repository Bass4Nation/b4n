SELECT personer.personnummer, fornavn, etternavn, gatenavn, husnummer, postnummer.postnummer, poststed, lånedato, låneid  

FROM låneliste
JOIN personer
ON låneliste.personnummer = personer.personnummer
JOIN postnummer
ON personer.postnummer = postnummer.postnummer

WHERE levertdato IS NULL
AND DATE_ADD(lånedato,INTERVAL 30 DAY) < CURRENT_DATE() 

GROUP BY låneid
ORDER BY lånedato DESC













