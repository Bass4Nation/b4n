SELECT SUM(population)/1000000 AS innbyggere,
CASE
	WHEN population > 100000000 THEN 'Big Country'
	WHEN population > 10000000 THEN 'Medium Country'
	WHEN population > 1000 THEN 'Small Country'
    ELSE 'Very small country'
END AS størrelse
FROM world
GROUP BY størrelse
