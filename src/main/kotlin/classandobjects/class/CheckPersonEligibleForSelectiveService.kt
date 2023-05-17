package classandobjects.`class`

import classandobjects.interfaces.lambda.CheckPerson

class CheckPersonEligibleForSelectiveService: CheckPerson {
    override fun validateAge(p: Person): Boolean {
        return p.getAge()!! >=18 && p.getName().length ==6
    }


}