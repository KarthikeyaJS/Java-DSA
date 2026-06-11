class Solution:
    def capitalizeTitle(self, title: str) -> str:
        arr=title.split()
        for i in range(len(arr)):
            if(len(arr[i])<=2):
                arr[i]=arr[i].lower()
            else:
                arr[i]=arr[i].capitalize()
        return " ".join(arr)