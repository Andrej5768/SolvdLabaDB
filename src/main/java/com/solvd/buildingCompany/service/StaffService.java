package com.solvd.buildingCompany.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.solvd.buildingCompany.connection.DataSource;
import com.solvd.buildingCompany.persistence.dao.IAddressRepository;
import com.solvd.buildingCompany.persistence.dao.IPhoneNumberRepository;
import com.solvd.buildingCompany.persistence.dao.IStaffRepository;
import com.solvd.buildingCompany.persistence.model.Address;
import com.solvd.buildingCompany.persistence.model.PhoneNumber;
import com.solvd.buildingCompany.persistence.model.Staff;
import com.solvd.buildingCompany.util.MyBatisFactory;


public class StaffService implements IStaffRepository, IAddressRepository, IPhoneNumberRepository {

    private final Logger logger = LoggerFactory.getLogger(StaffService.class);

    private IStaffRepository staffRepository = MyBatisFactory.getSqlSessionFactory()
            .openSession().getMapper(IStaffRepository.class);
    private IAddressRepository addressRepository = MyBatisFactory.getSqlSessionFactory()
            .openSession().getMapper(IAddressRepository.class);
    private IPhoneNumberRepository phoneNumberRepository = MyBatisFactory.getSqlSessionFactory()
            .openSession().getMapper(IPhoneNumberRepository.class);

    public StaffService() {
    }

    @Override
    public Staff getStaffById(long id) {
        return staffRepository.getStaffById(id);
    }

    @Override
    public List<Staff> getAllStaff() {
        return staffRepository.getAllStaff();
    }

    @Override
    public void save(Staff staff) {
        staffRepository.save(staff);
    }

    @Override
    public void update(Staff staff) {
        staffRepository.update(staff);
    }

    @Override
    public void delete(Staff staff) {
        staffRepository.delete(staff);
    }

    @Override
    public Address getAddressById(Long id) {
        return addressRepository.getAddressById(id);
    }

    @Override
    public List<Address> getAllAddress() {
        return addressRepository.getAllAddress();
    }

    @Override
    public PhoneNumber getPhoneNumberById(long id) {
        return phoneNumberRepository.getPhoneNumberById(id);
    }

    public static List<String> getAllStaffInfo() {
        String query = new StringBuilder().append("SELECT s.staff_id, s.first_name, s.last_name, ")
                .append("s.start_date, s.end_date, dd.dept_name, ")
                .append("sp.pos_name, a.citi, pn.phone_number, sa.salary ")
                .append("FROM staff s JOIN address a on a.id = s.address_id ")
                .append("JOIN department_details dd on s.dept_id = dd.dept_id ")
                .append("JOIN phone_number pn on s.phone_number_id = pn.id ")
                .append("JOIN salaries sa on s.salaries_id = sa.id ")
                .append("JOIN staff_position sp on s.pos_id = sp.pos_id ")
                .append("group by s.staff_id order by s.staff_id;").toString();
        List<String> allStaffInfo = new ArrayList<>();
        try (Connection connection = DataSource.getConnection(); Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                allStaffInfo.add(resultSet.getLong(1) + " " +
                        resultSet.getString(2) + " " +
                        resultSet.getString(3) + " " +
                        resultSet.getDate(4) + " " +
                        resultSet.getDate(5) + " " +
                        resultSet.getString(6) + " " +
                        resultSet.getString(7) + " " +
                        resultSet.getString(8) + " " +
                        resultSet.getString(9) + " " +
                        resultSet.getString(10)
                );
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return allStaffInfo;
    }

    public static String getStaffInfo(Staff staff) {
        String query = new StringBuilder().append("SELECT s.staff_id, s.first_name, s.last_name, ")
                .append("s.start_date, s.end_date, dd.dept_name, ")
                .append("sp.pos_name, a.citi, pn.phone_number, sa.salary ")
                .append("FROM staff s JOIN address a on a.id = s.address_id ")
                .append("JOIN department_details dd on s.dept_id = dd.dept_id ")
                .append("JOIN phone_number pn on s.phone_number_id = pn.id ")
                .append("JOIN salaries sa on s.salaries_id = sa.id ")
                .append("JOIN staff_position sp on s.pos_id = sp.pos_id ")
                .append("where s.staff_id = ").append(staff.getId()).append(" ;").toString();
        String staffInfo;
        try {
            Connection connection = DataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();
            staffInfo = "" + resultSet.getInt(1) +
                    " " + resultSet.getString(2) +
                    " " + resultSet.getString(3) +
                    " " + resultSet.getDate(4) +
                    " " + resultSet.getDate(5) +
                    " " + resultSet.getString(6) +
                    " " + resultSet.getString(7) +
                    " " + resultSet.getString(8) +
                    " " + resultSet.getString(9) +
                    " " + resultSet.getString(10);
            resultSet.close();
            DataSource.returnConnection(connection);

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return staffInfo;
    }
}
