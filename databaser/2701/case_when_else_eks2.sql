SELECT COUNT(*) AS TELLER,
CASE
WHEN LEFT (name, 1) IN ('a','e') THEN "Vokal"
ELSE 'Konsonant'
END AS forbokstav
FROM world
GROUP BY forbokstav
