CREATE DATABASE jaegers;
\c jaegers;
CREATE TABLE jaegers (
	id SERIAL PRIMARY KEY,
	modelName TEXT,
	mark TEXT,
	height REAL,
	weight REAL,
	status TEXT,
	origin TEXT,
	launch DATE,
	kaijuKill INTEGER
);