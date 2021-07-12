package com.codecafe.basics.equality.kotlin

class EmployeeK(var name: String, val id: Int) {

    override fun equals(obj: Any?): Boolean {

        if(obj is EmployeeK) {
            return name == obj.name && id == obj.id
        }

        return false
    }

}