SELECT kunder.navn AS kunde,
-- transaksjoner.antall,
-- produkter.pris,
SUM(transaksjoner.antall * produkter.pris) AS Beløp
FROM kunder
JOIN transaksjoner
ON kunder.id = transaksjoner.kundeid
JOIN produkter
ON produkter.id = transaksjoner.produktid
GROUP BY kunde
ORDER BY Beløp DESC;