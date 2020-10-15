class CustomStack:

    def __init__(self, maxSize: int):
        
        self.stack = []
        self.mx_size = maxSize

    def push(self, x: int) -> None:
        if len(self.stack) < self.mx_size:
            self.stack.append(x)
        

    def pop(self) -> int:
        if len(self.stack) == 0:
            return -1
        else:
            return self.stack.pop()
        

    def increment(self, k: int, val: int) -> None:
        if len(self.stack) <= k:
            for i in range(len(self.stack)):
                self.stack[i] += val
        else:
            for i in range(k):
                self.stack[i] += val
        


# Your CustomStack object will be instantiated and called as such:
# obj = CustomStack(maxSize)
# obj.push(x)
# param_2 = obj.pop()
# obj.increment(k,val)