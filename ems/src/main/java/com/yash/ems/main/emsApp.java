package com.yash.ems.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.yash.ems.modal.Employee;
import com.yash.ems.service.EmployeeService;
import com.yash.ems.serviceimpl.EmployeeSerivceImpl;
import com.yash.ems.util.Constant;
public class emsApp
{

	public static void main(String[] args)
	{
		EmployeeSerivceImpl.EmpList(EmployeeService.initEmpList(new ArrayList<Employee>()));
	     empOperation();
	     }
	
	private static void empOperation()
	{
		try(Scanner sc=new Scanner(System.in))
		{
			String i=Constant.STR_EMPTY;
			do
			{
				System.out.println("Select your choice -");
				System.out.println("1. Get Employee By Id");
				System.out.println("2. Search Employee By Name");
				System.out.println("3. Search Employee By Department");
				System.out.println("4. Get Employee By Salary");
				System.out.println("5. Get DepartmentList");
			    System.out.println("6. Get All Employees");
				System.out.println("0. Exit");
				i=sc.next();
				EmployeeService empService = new EmployeeSerivceImpl();
				switch(i)
				{
				case Constant.STR_1:
					System.out.println("Enter Id of Emp :");
					empService.getEmployeeById();
					break;
				case Constant.STR_2:
					System.out.println("Enter name of Emp :");
					empService.getEmployeeByName();
					break;
				case Constant.STR_3:
					System.out.println("Enter name of Dept :");
					empService.getEmployeeByDepartment();
					break;
					
				case Constant.STR_4:
					System.out.println("Enter salary of Emp :");
					empService.getEmployeeBySalary();
					break;
					
                case Constant.STR_5:
				 empService.getAllDepartment();
					break;
					
              
                case Constant.STR_6:
   				 empService.getAllEmployees();
   					break;
   					
   				
            
                case Constant.STR_0:
   				 default:
   					break;
				}
			}
			while(!i.equals(Constant.STR_0));
		}
		catch(Exception e)
		{
			e.printStackTrace();
				
			}
		}
	}

