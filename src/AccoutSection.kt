import java.util.*

class AccoutSection:BankInterface {

    companion object {

        fun calCompound() {
            println("Please select an option from the following menu:")
            println("Press 1: \t • Calculate Loan Interest Compound")
            println("Press 2: \t • Opening New Account")

            var ota = Integer.valueOf(readLine())

            println("Select Option---> ")

            if (ota == 1) {

                val scanner = Scanner(System.`in`)

                //Input Amount
                print("Enter Principal Amount : ")
                val principalAmount = scanner.nextDouble()

                //Input Interest Rate
                print("Enter Rate of Interest : ")
                val rateOfInterest = scanner.nextDouble()

                //Input time in years
                print("Enter Time : ")
                val time = scanner.nextDouble()

                //Calculate Compound Interest
                val compoundInterest = principalAmount.toDouble() * Math.pow((1 + rateOfInterest.toDouble() / 100.00), time.toDouble())

                //Print Compound Interest
                println("Compound Interest is as your input ${principalAmount}and ${rateOfInterest} and ${time} is: :$compoundInterest")
            }

        }

    }

            override fun openaccount() {
           super.openaccount()
    }
}

