class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float: 
        res = []

        for i in (nums1):
            res.append(i)
        for i in (nums2):
            res.append(i)
        res.sort()
        l = len(res)
        if l % 2 == 0:
            v1 = (l+1)//2
            v2 = (l+2)//2
            n1= res[v1-1] 
            n2 = res[v2-1]
            avg = (n1+n2)/2
            return avg
        else:
            return res[(l)//2]


        