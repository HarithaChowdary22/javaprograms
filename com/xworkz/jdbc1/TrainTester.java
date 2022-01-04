package com.xworkz.jdbc1;

import java.util.ArrayList;
import java.util.Collection;

public class TrainTester {
public static void main(String[] args) {
TrainDTO dto =new TrainDTO (3,556677,"ballari","delhi", 420, 700, "normal", "kk express");
TrainDAO dao =new TrainDAO();
System.out.println(dao.save(dto));
System.out.println(dao.deleteByTrainNo(133455));
System.out.println(dao.deleteByTrainNoAndTid(133455, 1));
TrainDTO trainDTO=dao.getByTrainNo(445566);
System.out.println(trainDTO);
Collection<TrainDTO> trains=dao.getAll(null);
 trains.forEach((e)-> System.out.println(e));
 Collection<TrainDTO> trains2=dao.getAllByBording();
 trains2.forEach((e)-> System.out.println(e));
 Collection<TrainDTO> trains1 = dao. AllByDestination();
 trains.forEach((e)-> System.out.println(e));
 System.out.println(dao.updateDestinationAndBoardingByNo(445566, "visakapatnam","new delhi"));
 System.out.println(dao.updateDestinationByNo("new delhi", 445566));
 System.out.println(dao.getTotal());
 System.out.println(dao.getMaxPrice());
 System.out.println(dao.getMinPrice());
 
}
}

