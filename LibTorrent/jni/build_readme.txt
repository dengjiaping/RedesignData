	--- arm ---
1. � ����� Application.mk:
	1.1. APP_ABI := armeabi armeabi-v7a
2. � ����� Android.mk:
	2.1. ��� ������ libboost_filesystem-gcc-mt-1_53 ����� LOCAL_SRC_FILES := boost/android/lib-arm/libboost_filesystem-gcc-mt-1_53.a
	2.1. ��� ������ libboost_system-gcc-mt-1_53 ����� LOCAL_SRC_FILES := boost/android/lib-arm/libboost_system-gcc-mt-1_53.a
	
	--- x86 ---
1. � ����� Application.mk:
	1.1. APP_ABI := x86
2. � ����� Android.mk:
	2.1. ��� ������ libboost_filesystem-gcc-mt-1_53 ����� LOCAL_SRC_FILES := boost/android/lib-x86/libboost_filesystem-gcc-mt-1_53.a
	2.1. ��� ������ libboost_system-gcc-mt-1_53 ����� LOCAL_SRC_FILES := boost/android/lib-x86/libboost_system-gcc-mt-1_53.a
	
��������� ndk-build 

(ndk-build -j9 ��� ������������� ���� ����)