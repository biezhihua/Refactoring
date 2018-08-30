package 重新组织数据.以子类取代类型码

abstract class Employee {

    companion object {
        val ENGINEER = 0
        val SALESMAN = 1
        val MANAGER = 2
    }

    abstract fun getType(): Int
}

object EmployeeFactory {

    fun create(type: Int) = when (type) {
        Employee.ENGINEER -> Engineer()
        Employee.SALESMAN -> Salesman()
        Employee.MANAGER -> Manager()
        else -> throw IllegalArgumentException()
    }
}

class Manager : Employee() {

    override fun getType(): Int {
        return Employee.MANAGER
    }
}

class Engineer : Employee() {

    override fun getType(): Int {
        return Employee.ENGINEER
    }
}

class Salesman : Employee() {
    override fun getType(): Int {
        return Employee.SALESMAN
    }
}