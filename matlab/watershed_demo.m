I= imread('D:\ALEXWU\Document\求职简历\证件照片\DSC_7089.jpg');    
imshow(I);
h=fspecial('sobel'); %h = fspecial(type) creates a two-dimensional filter h of the specified type. fspecial returns h as
                     %a correlation kernel, which is the appropriate form to use with imfilter. type is a string having one of these values. 
fd=double(I);%double使数据变成双精度
g=sqrt(imfilter(fd,h,'replicate').^2+imfilter(fd,h','replicate').^2);
figure;
imshow(g);
g2=imclose(imopen(g,ones(3,3)),ones(3,3));
figure;
imshow(g2);
im=imextendedmin(g2,10);   %
Lim=watershed(bwdist(im)); %watershed分水岭算法 Lim的值greater than or equal to 0，等于0是分水岭脊像素
em=Lim==0;
g3=imimposemin(g2,im|em);
g4=watershed(g3);
figure;
imshow(g4);
g5=I;
g5(g4==0)=255;
figure;
imshow(g5);
