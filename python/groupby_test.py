# -*- coding: utf-8 -*-
"""
Created on Sun Sep 12 16:51:25 2021

@author: alexwu
"""

import pandas as pd

import numpy as np

company=["A","B","C"]
data=pd.DataFrame({
    "company":[company[x] for x in np.random.randint(0,len(company),10)],
    "salary":np.random.randint(5,50,10),
    "age":np.random.randint(15,50,10)
}
)


df=pd.DataFrame()
a=[1,1,1,2,2,]
b=['red','red','green','red','blue']
df['a']=a
df['b']=b
ans=df.groupby('b').agg({'a':lambda x:
                         x.value_counts().index[0]}).reset_index()

ans2=df.groupby('b').agg({'a':lambda x: x.value_counts().index[0]})