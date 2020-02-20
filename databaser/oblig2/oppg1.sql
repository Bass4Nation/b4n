SELECT tittel, lånedato, levertdato
FROM låneliste
INNER JOIN bøker
ON låneliste.bokId = bøker.bokId
INNER JOIN forfattere
ON bøker.forfatterid = forfattere.id

INNER JOIN personer
ON låneliste.personnummer = personer.personnummer
INNER JOIN postnummer
ON personer.postnummer = postnummer.postnummer

WHERE levertdato IS NULL



