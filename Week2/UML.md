
## Class Diagram


Student *-*Course

Course *-1 Instructor

Instructor<-PermanentI

Instructor<-VistingR

Student has
-name:String
-birthDate : int
-adress:String
-gender:String

Course has
-courseName:String
-courseCode:int
-credtiScore:int

Instructor has
-instName:String
-instAdress:String
-phoneNum:String

PermanentI extends Instructor
-fixedSalary

VisitingR extends Instructor
-hourlySalary:int
