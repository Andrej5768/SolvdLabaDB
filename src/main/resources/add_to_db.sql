-- -----------------------------------------------------
-- Create minimal staff to company.
-- -----------------------------------------------------

INSERT INTO staff_position (pos_name)
VALUES ('engineer'),
       ('manager'),
       ('director'),
       ('accountant');

INSERT INTO address (citi)
VALUES ('Kyiv'),
       ('Kyiv'),
       ('Kyiv'),
       ('Kyiv'),
       ('Kyiv'),
       ('Brovary'),
       ('Kyiv');

INSERT INTO phone_number (phone_number)
VALUES ('+380961238543'),
       ('+380961238543'),
       ('+380961238543'),
       ('+380961238543'),
       ('+380961238543'),
       ('+380961238543'),
       ('+380961238543');

INSERT INTO salaries (salary)
VALUES (5000),
       (4000),
       (3000);

INSERT INTO department_details (dept_name)
VALUES ('Financial'),
       ('Main office'),
       ('Engineering');

INSERT INTO staff (first_name, last_name, start_date, dept_id, pos_id, address_id, phone_number_id, salaries_id)
VALUES ('Andrew', 'Skrypka', CURRENT_DATE, 3, 1, 1, 1, 2),
       ('Egor', 'Sharifov', CURRENT_DATE, 3, 1, 6, 2, 2),
       ('Ivan', 'Ivanov', CURRENT_DATE, 3, 1, 7, 3, 2),
       ('Yaroslav', 'Duda', CURRENT_DATE, 2, 2, 5, 4, 3),
       ('Petro', 'Malikov', CURRENT_DATE, 2, 2, 2, 5, 2),
       ('Svetlana', 'Lozovaya', CURRENT_DATE, 1, 4, 3, 6, 2),
       ('Maxim', 'Petrenko', CURRENT_DATE, 2, 3, 4, 7, 1);

INSERT INTO crews (id)
VALUES (1),
       (2);

INSERT INTO machines (name, crews_id)
VALUES ('Excavator', 2),
       ('Bulldozer', 2),
       ('Crane', 1),
       ('Truck', 1),
       ('Dump truck', 2);

-- -----------------------------------------------------
-- Create projects.
-- -----------------------------------------------------
INSERT INTO clients (first_name, lastname, phone_number, company_name)
VALUES ('Anton', 'Belicki', '+380502244856', 'LuckyCorp');

INSERT INTO projects (name, assigned_to, create_by, client_id)
VALUES ('casino', 4, 4, 1),
       ('park', 5, 4, 1);

INSERT INTO bills (amount, client_id, project_id)
VALUES (515151.54, 1, 1),
       (10000, 1, 2);

