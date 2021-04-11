
# FILE:     maker.py
# DATE:     2021-04-10
# AUTHOR:   Class
# DESCRIPTION:
#       We'll get to that in a moment.
#

import datetime
import os


def main():
    """ Program starts here """
    print("\n\t*** SQL Maker ***\n")
    # get the name of the program
    program_name = input("Please enter the program name: ")
    # get the date
    program_date = datetime.datetime.now().strftime("%Y-%m-%d")
    # print("The Date: ", program_date)
    # get the author name -- You can hard-code this if you are the only author
    # program_author = input("Enter your name: ") + " " + os.getlogin()
    program_author = os.getlogin()
    # get the description
    program_description = input("Enter the description of the program: ")
    # build the file name
    file_name = program_name.replace(' ', '_') + ".txt"
    print("File Name:", file_name)
    # write the file
    # 1) Open the file and save the file handle to a variable
    the_file = open(file_name, "w")
    # 2) Write the elements of the file
the_file.write('FILE: Notes.txt)\n')
the_file.write('DATE: 2021-04-08)\n')
the_file.write('AUTHOR: Class/n')
the_file.write('Description\n')
the_file.write('/tNotes related to creating databases and tables.\n')
the_file.write('/*******************************************************************************\\n')
the_file.write('-- Standard pattern for creating a database.\n')

the_file.write('DROP DATABASE IF EXISTS <database name>;\n')
the_file.write('CREATE DATABASE <database name>;\n')
the_file.write('USE <database name>;\n')

the_file.write('/*\n')
the_file.write('EXAMPLE:\n')
the_file.write('DROP DATABASE IF EXISTS carlot;\n')
the_file.write('CREATE DATABASE carlot;\n')
the_file.write('USE carlot;\n')
the_file.write('*/\n')

the_file.write('DROP TABLE IF EXISTS <table name>;\n')
the_file.write('CREATE TABLE <table name>\n')
the_file.write('\t<field name> <data type> [NULL | NOT NULL] [DEFAULT = <value>] [UNIQUE] \n')
the_file.write('\t[AUTO_INCREMENT] COMMENT \'<field description>\'  [, <other field definition>]\n')
the_file.write('\t, PRIMARY KEY(<field> [, <other field list>])\n')
the_file.write('\t[, CONSTRAINT <constraint name> \n')
the_file.write('\t/tFOREIGN KEY (<local field name>)\n')
the_file.write('\t/tREFERENCES <other table> (<other table field name>)]\n')
the_file.write('\t[, <other constraints as needed>]\n')
	
the_file.write(' ) COMMENT \'<Description of the table>\'\n')
the_file.write(';/n')

the_file.write('/*\n')
the_file.write('AUTO INCREMENT\n')
the_file.write('\t-There can only be one per tables\n')
the_file.write('\t-DATA type must be an INT\n')
the_file.write('\t-the field must the PRIMARY KEY\n')
the_file.write('\t-Cannot be a composite key\n')
the_file.write('*/\n')
the_file.write('DEFAULT\n')
the_file.write('\t- Specify a value to use when the field gets NULL\n')
the_file.write('\t- Must be the same data type as the field\n')
the_file.write('\t- Only use when a default makes sense in the context\n')

the_file.write('UNIQUE\n')
the_file.write('\t- Constrains the field so there cannot be duplicate values in this table\n')
the_file.write('\t- When used in the field definition, only applies to that field\n')
the_file.write('\t- There is another way to apply a UNIQUE constraint on combined fields\n')
the_file.write('\t- The list is one or more fields seperated by commas\n')
	
the_file.write('FOREIGN KEYS\n')
the_file.write('\t- Constraint name is usually in the format fk_<field name>_<other table>\n')
the_file.write('\t- The table with the FOREGIN KEY constraint must appear inthe script AFTER the table being referenced\n')
	
	
the_file.write('EXAMPLE\n')


the_file.write('DROP TABLE IF EXISTS sales_person;\n')
the_file.write('CREATE TABLE sales_person \(\n')
the_file.write('\tsales_person_id INT NOT NULL AUTO_INCREMENT COMMENT \'ID\'\n')
the_file.write('\t	, first_name VARCHAR\(50\) NOT NULL COMMENT \'Person first name\'\n')
the_file.write('\t	, last_name VARCHAR\(50\) NOT NULL COMMENT \'Person first name\'\n')
the_file.write('\t	, dob DATE NOT NULL COMMENT \'Date of birth\'\n')
the_file.write('\t	, PRIMARY KEY (sales_person_id)\n')
the_file.write('\t \) COMMENT \'A table for sales person record.\n')

the_file.write('DROP TABLE IF EXISTS car;\n')
the_file.write('CREATE TABLE car\(\n')
the_file.write('	vin VARCHAR(100) NOT NULL COMMENT \'Vehicle Identification Number\'\n')
the_file.write('	, make VARCHAR(100) NOT NULL COMMENT \'Manufacturer\'\n')
the_file.write('the_file.write(\'	, model VARCHAR(100) NOT NULL COMMENT \'Model\'\n')
the_file.write('	, model_year YEAR NOT NULL COMMENT \'model year\'\n')
the_file.write('	, PRIMARY KEY(vin)\n')
the_file.write('\) COMMENT \'A table for car records.\'\n')
the_file.write(';\n\n')
	
the_file.write('DROP TABLE IF EXISTS sale;\n')
the_file.write('CREATE TABLE sale(\n')
the_file.write('\t	sales_person_id INT NOT NULL AUTO_INCREMENT COMMENT 
the_file.write('\t	, vin VARCHAR(100) NOT NULL COMMENT \'Vehicle Identification Number\'\n')
the_file.write('\t	, sale_date DATE NOT NULL COMMENT \'Date of the sale\'\n')
the_file.write('\t	, sale_amount DECIMAL(7, 2) NOT NULL COMMENT \'Dollar amount of the sale\'\n')
the_file.write('\t	, PRIMARY KEY(sales_person_id, vin, sale_date)\n')
the_file.write('\t	, CONSTRAINT fk_sales_person_id_sales_person\n')
the_file.write('\t		FOREIGN KEY (sales_person_id\n')
the_file.write('\t		REFERENCES sales_person(sales_person_id)\n')
the_file.write('\t	, CONSTRAINT fk_vin_car\n')
the_file.write('\t		FOREIGN KEY (vin) \n')
the_file.write('\t \) COMMENT \'Car Sales Records.\'\n')
the_file.write(';\n')












