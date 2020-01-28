SELECT *
FROM doctors
LEFT JOIN patients
ON doctors.id = patients.doctorId
UNION ALL
SELECT *
FROM  doctors
RIGHT JOIN patients
ON doctors.id = patients.doctorId
WHERE patients.doctorId IS NULL