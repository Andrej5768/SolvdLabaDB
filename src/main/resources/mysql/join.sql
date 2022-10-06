SELECT staff.staff_id, staff.first_name, staff.last_name,
       staff.start_date, staff.end_date, dd.dept_name,
       sp.pos_name, a.citi, pn.phone_number,
       sa.salary
FROM staff,
     staff s JOIN address a on a.id = s.address_id,
     staff s1 JOIN department_details dd on s1.dept_id = dd.dept_id,
     staff s2 JOIN phone_number pn on s2.phone_number_id = pn.id,
     staff s3 JOIN salaries sa on s3.salaries_id = sa.id,
     staff s4 JOIN staff_position sp on s4.pos_id = sp.pos_id

SELECT s.staff_id, s.first_name, s.last_name,
       s.start_date, s.end_date, dd.dept_name,
       sp.pos_name, a.citi, pn.phone_number,
       sa.salary
FROM staff s JOIN address a on a.id = s.address_id
             JOIN department_details dd on s.dept_id = dd.dept_id
             JOIN phone_number pn on s.phone_number_id = pn.id
             JOIN salaries sa on s.salaries_id = sa.id
             JOIN staff_position sp on s.pos_id = sp.pos_id where s.staff_id = 2;