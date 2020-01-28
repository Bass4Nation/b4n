SELECT SUM(area) AS SUM_Litauen_Latvia_Estland
FROM world
WHERE name IN('Lithuania','Latvia', 'Estonia')
