/*--------Exercise-1---------------*/
create table Staff(StaffNo number(10) constraint stno_pk primary key ,DentistName varchar2(20));
create table SurgeryDetails(StaffNo number(10) constraint stno_pk primary key,appointMentDate Date,SurgeryNo number(5));
create table Patient(PatientNo number(5)constraint pno_pk primary key,PatientName varcar2(20));
create table AppointmentDetails(StaffNo number(10) constraint stno_pk primary key,appointmentDate Date,,appointmentTime Time,PatientNo number(5) constraint pno_ref References Patient(PatientNo));

/*--------Exercise-2---------------*/
create table InsuranceDetails(NIN varchar2(10),contractNo number(10),hrsPerWeek number(10),Primary Key(NIN,contractNo));
create table Staff(NIN varchar2(10) contsraint nin_pk primary key,Ename varchar2(20));
create table Hotels(HotelNo varchar2(10) constraint hno_pk primary key,HotelLocation varchar2(15));
create table HotelsContracts(contractNo number(10) contsraint cno_pk primary key,HotelNo varchar2(10) constraint hno_ref references Hotels(HotelNo));

