SELECT name, area
FROM world
WHERE continent NOT IN('Asia')
ORDER BY area DESC
LIMIT 3