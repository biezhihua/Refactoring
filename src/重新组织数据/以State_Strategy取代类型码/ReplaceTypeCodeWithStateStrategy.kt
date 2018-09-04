package 重新组织数据.以State_Strategy取代类型码

import 重新组织数据.以子类取代类型码.Employee

abstract class EmployeeType {

    abstract fun getTypeCode(): Int

    companion object {
        val ENGINEER = 0
        val SALESMAN = 1
        val MANAGER = 2
    }

}

class Engineer : EmployeeType() {

    override fun getTypeCode(): Int {
        return EmployeeType.ENGINEER
    }

}

class Manaager : EmployeeType() {

    override fun getTypeCode(): Int {
        return EmployeeType.MANAGER
    }

}

class Salesman : EmployeeType() {
    override fun getTypeCode(): Int {
        return EmployeeType.SALESMAN
    }

}