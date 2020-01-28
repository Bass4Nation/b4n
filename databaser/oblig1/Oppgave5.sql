SELECT SUM(gdp )/(10000000) AS GDP_Skandinavia
FROM World
WHERE name IN('Norway', 'Sweden', 'Denmark')