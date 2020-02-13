SELECT * 
FROM world
WHERE population = (SELECT MAX(population) FROM world);