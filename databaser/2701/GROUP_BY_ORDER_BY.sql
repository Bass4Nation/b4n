SELECT kunder.navn AS Kunder,
SUM(transaksjoner.antall) AS Antall
FROM kunder
JOIN transaksjoner
ON transaksjoner.kundeid = kunder.id
GROUP BY Kunder
ORDER BY Antall DESC