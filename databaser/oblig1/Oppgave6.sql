SELECT COUNT(*) AS Antall_ganger, SUBSTRING(name,1,1) AS Bokstav_flest
FROM world
GROUP BY SUBSTRING(name,1,1)
ORDER BY Antall_ganger DESC, Bokstav_flest ASC
LIMIT 1