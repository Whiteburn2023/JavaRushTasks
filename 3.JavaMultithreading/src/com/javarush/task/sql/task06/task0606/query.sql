-- Write your code here:
CREATE TABLE team
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    position    VARCHAR(255) NOT NULL,
    full_name   VARCHAR(255) NOT NULL,
    number      INT
);

INSERT INTO team (id, "position", full_name, number)
VALUES (1, 'Goalkeeper', 'Lev Yashin', 1),
       (2, 'Right-back', 'Cafu', 2),
       (3, 'Centre-back', 'Franz Beckenbauer', 3),
       (4, 'Centre-back', 'Bobby Moore', 4),
       (5, 'Left-back', 'Paolo Maldini', 5),
       (6, 'Midfield', 'Johan Cruyff', 6),
       (7, 'Midfield', 'Zinedine Zidane', 7),
       (8, 'Midfield', 'Andrea Pirlo', 8),
       (9, 'Midfield', 'Lothar Matthaus', 9),
       (10, 'Striker', 'Pele', 10),
       (11, 'Forward', 'Marco van Basten', 11);

