SELECT tittel AS Tittel, fornavn AS Fornavn, etternavn AS Etternavn, antall, (levertdato IS NULL) AS utlånt, (antall - (levertdato IS NULL))  AS Gjenstående
FROM låneliste
JOIN bøker
ON låneliste.bokId = bøker.bokId
JOIN forfattere
ON bøker.forfatterid = forfattere.id

group by Tittel
ORDER BY Gjenstående DESC