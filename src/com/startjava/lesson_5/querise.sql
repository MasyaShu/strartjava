--выведите всю таблицу
SELECT * FROM jaegers;
--отобразите только не уничтоженных роботов
SELECT * FROM jaegers WHERE status = 'Active';
--отобразите роботов нескольких серий, например Mark-1 и Mark-6
SELECT * FROM jaegers WHERE mark = 'Mark-6' OR mark = 'Mark-1';
--отсортируйте таблицу по убыванию по столбцу mark
SELECT * FROM jaegers ORDER BY mark DESC;
--отобразите самого старого робота
SELECT * FROM jaegers WHERE launch = (SELECT MIN(launch) FROM jaegers);
--отобразите роботов, которые уничтожили больше/меньше всех kaiju
SELECT * FROM jaegers WHERE kaijuKill = (SELECT MIN(kaijuKill) FROM jaegers);
SELECT * FROM jaegers WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM jaegers);
--отобразите средний вес роботов
SELECT AVG(weight) FROM jaegers;
--увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены
UPDATE jaegers SET kaijuKill = kaijuKill + 1 WHERE status = 'Active';
--удалите уничтоженных роботов
DELETE FROM jaegers WHERE status = 'Destroyed';