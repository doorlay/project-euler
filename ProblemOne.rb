class ProblemOne < Problem
    def initialize(number, answer)
        @answer = answer()
        @number = 1
    def answer
        sum = 0
        counter = 0
            while counter < 1000
                if counter % 3 == 0 || counter % 5 == 0
                     sum += counter
                end
            counter += 1
            end
        return sum