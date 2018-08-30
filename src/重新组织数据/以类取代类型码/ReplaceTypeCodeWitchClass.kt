package 重新组织数据.以类取代类型码

class Person(bloodGroup: BloodGroup) {

    var bloodGroup = bloodGroup
        get
        set
}

class BloodGroup(code: Int) {

    var code = code

    companion object {

        val O = BloodGroup(0)
        val A = BloodGroup(1)
        val B = BloodGroup(2)
        val C = BloodGroup(3)
        val AB = BloodGroup(4)

        val values = arrayOf(O, A, B, C, AB)

        fun code(code: Int): BloodGroup {
            return values[code]
        }
    }
}


