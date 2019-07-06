package com.example.recall.work

class Job(var salary: Int, val name: String) {
    var isCurrent = false
    fun plusSalary(num: Int) {
        salary += num
    }

    fun raiseSalary(percent: Int) {
        salary = salary * (percent + 100) / 100
    }

    fun getInfo(): Array<Any> {
        return arrayOf(name, salary, isCurrent)
    }
}