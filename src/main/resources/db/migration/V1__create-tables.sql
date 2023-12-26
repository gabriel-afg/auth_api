CREATE TABLE product (
                         id TEXT PRIMARY KEY UNIQUE NOT NULL,
                         name TEXT NOT NULL,
                         price INTEGER NOT NULL
);

CREATE TABLE users (
                       id TEXT PRIMARY KEY UNIQUE NOT NULL,
                       login TEXT NOT NULL UNIQUE,
                       password TEXT NOT NULL,
                       role TEXT NOT NULL
);