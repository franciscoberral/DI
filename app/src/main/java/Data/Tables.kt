package Data

import  Models.Person

class Tables {
    abstract class Persons {
        companion object{
            val _ID = "_id"
            val TABLE_NAME = "persons"
            val COLUMN_NAME = "name"
            val COLUMN_AGE = "age"
            val COLUMN_TYPE = "type"
            var persons: MutableList<Person> = ArrayList()
        }
    }
}