package com.xworkz.jdbc1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class TrainDAO {

	
	public boolean save(TrainDTO dto) {
		Connection connection = null;
		connection = SQLUtil.creatConnection();

		try {
			String str = "insert into SQLConstants values(?,?,?,?,?,?,?,?)";

			PreparedStatement stm = connection.prepareStatement(str);
			stm.setInt(1, dto.getTid());
			stm.setString(1, dto.getName());
			stm.setInt(1, dto.getTrainNo());
			stm.setInt(1, dto.getSeatNo());
			stm.setString(1, dto.getDestination());
			stm.setString(1, dto.getBoarding());
			stm.setInt(1, dto.getPrice());
			stm.setString(1, dto.gettClass());

			int row = stm.executeUpdate(str);
			if (row == 1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

	public boolean deleteByTrainNo(int trainNo) {
		Connection connection = null;
		connection = SQLUtil.creatConnection();
		try {
			String str = "delete from SQLConstants where trainNo=?";
			Statement stm = connection.createStatement();
			int row = stm.executeUpdate(str);
			if (row == 1) {

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String str = "";

		return false;

	}

	public boolean deleteByTrainNoAndTid(int trainNo, int tid) {
		Connection connection = null;
		connection = SQLUtil.creatConnection();
		String str = "delete from SQLConstants where trainNo=' + no + ' and  tid=' + tid'";
		try {
			Statement stm = connection.createStatement();
			int row = stm.executeUpdate(str);
			if (row == 1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;

	}

	public TrainDTO getByTrainNo(int trainNo) {
		Connection connection = null;

		try {
			connection = SQLUtil.creatConnection();
			String str = "select * from SQLConstants where trainNo=?";
			PreparedStatement preparedStatement = connection.prepareStatement(str);
			preparedStatement.setObject(1, trainNo);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				TrainDTO d = new TrainDTO();
				d.setTid(resultSet.getInt(1));
				d.setName(resultSet.getString(2));
				d.setTrainNo(resultSet.getInt(3));
				d.setSeatNo(resultSet.getInt(4));
				d.setDestination(resultSet.getString(5));
				d.setBoarding(resultSet.getString(6));
				d.setPrice(resultSet.getInt(7));
				d.settClass(resultSet.getString(8));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	public Collection<TrainDTO> getAll(TrainDTO dto) {
		Connection connection = null;

		try {
			connection = SQLUtil.creatConnection();
			Collection<TrainDTO> collection = new ArrayList<TrainDTO>();
			String str = "select * from SQLConstants";
			PreparedStatement preparedStatement = connection.prepareStatement(str);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				TrainDTO d = new TrainDTO();
				d.setTid(resultSet.getInt(1));
				d.setName(resultSet.getString(2));
				d.setTrainNo(resultSet.getInt(3));
				d.setSeatNo(resultSet.getInt(4));
				d.setDestination(resultSet.getNString(5));
				d.setBoarding(resultSet.getString(6));
				d.setPrice(resultSet.getInt(7));
				d.settClass(resultSet.getString(8));
				collection.add(d);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;

	}

	public Collection<TrainDTO> getAllByBording() {
		Connection connection = null;

		try {

			connection = SQLUtil.creatConnection();
			Collection<TrainDTO> collection = new ArrayList<TrainDTO>();
			String str = "select * from SQLConstants value bording=?";
			PreparedStatement preparedStatement = connection.prepareStatement(str);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next())
				;
			TrainDTO d = new TrainDTO();
			d.setTid(resultSet.getInt(1));
			d.setName(resultSet.getString(2));
			d.setTrainNo(resultSet.getInt(3));
			d.setSeatNo(resultSet.getInt(4));
			d.setDestination(resultSet.getString(5));
			d.setBoarding(resultSet.getString(str));
			d.setPrice(resultSet.getInt(7));
			d.settClass(resultSet.getString(8));
			collection.add(d);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	public Collection<TrainDTO> AllByDestination() {
		Connection connection = null;

		try {
			connection = SQLUtil.creatConnection();
			Collection<TrainDTO> collection = new ArrayList<TrainDTO>();
			String str = "select * from SQLConstants value destination=?";
			PreparedStatement preparedStatement = connection.prepareStatement(str);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				
			TrainDTO d = new TrainDTO();
			d.setTid(resultSet.getInt(1));
			d.setName(resultSet.getString(2));
			d.setTrainNo(resultSet.getInt(3));
			d.setSeatNo(resultSet.getInt(4));
			d.setDestination(resultSet.getString(5));
			d.setBoarding(resultSet.getString(str));
			d.setPrice(resultSet.getInt(7));
			d.settClass(resultSet.getString(8));
			collection.add(d);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;

	}
	
	public static boolean updateDestinationByNo(String newDest,int No) {
		Connection connection = null;

		try {
			connection=SQLUtil.creatConnection();
			String str="update SQLConstant set destination=? where trainNo=?";
			PreparedStatement preparedStatement=connection.prepareStatement(str);
			preparedStatement.setObject(1, newDest);
			preparedStatement.setObject(2, No);
			return preparedStatement.executeLargeUpdate()>0 ? true:false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}
	public boolean updateDestinationAndBoardingByNo(int no,String newDest,String newBoarding) {
		Connection connection=null;
		
		try {
			connection=SQLUtil.creatConnection();
			String str="update SQLConstant set destination=? and boarding=? where trainNo=?";
			PreparedStatement preparedStatement=connection.prepareStatement(str);
			preparedStatement.setObject(1, newDest);
			preparedStatement.setObject(2, no);
			preparedStatement.setObject(3, newBoarding);
			return preparedStatement.executeUpdate()>0 ? true:false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
		
	}
		
		public int getTotal() {
			Connection connection=null;
			int total=0;
			
			try {
				connection=SQLUtil.creatConnection();
				String str="select  count(*) from SQLConstant";
				PreparedStatement preparedStatement=connection.prepareStatement(str);
				ResultSet res= preparedStatement.executeQuery();
				while (res.next()) {
					total=res.getInt(1);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return total;
		}
		public double getMaxPrice() {
			Connection connection=null;
			double maxPrice=0;
			
			try {
				connection=SQLUtil.creatConnection();
				String str="select max(price) from SQLConstant";
				PreparedStatement preparedStatement=connection.prepareStatement(str);
				ResultSet res= preparedStatement.executeQuery();
				while (res.next()) {
					maxPrice=res.getDouble(1);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return maxPrice;
		}
		public double getMinPrice() {
			Connection connection=null;
			double minPrice=0;
			
			try {
				connection=SQLUtil.creatConnection();
				String str="select min(price) from SQLConstant";
				PreparedStatement preparedStatement=connection.prepareStatement(str);
				ResultSet res= preparedStatement.executeQuery();
				while (res.next()) {
					minPrice=res.getDouble(1);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return minPrice;
		}
		
		

	}
