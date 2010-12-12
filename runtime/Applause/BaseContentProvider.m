// © 2010 Ralf Ebert
// Made available under Simplified BSD License, http://www.opensource.org/licenses/bsd-license.php

#import "BaseContentProvider.h"

#import "ContentProviderProtected.h"

@implementation BaseContentProvider

@synthesize content = fContent;

- (id) content {
	return ([fContent isKindOfClass:[NSError class]]) ? nil : fContent;
}

- (void) setContent:(id)content {
	if (content != fContent) {
		[fContent release];
		id result = [self processContent:content];
		if ([result isKindOfClass:[NSError class]]) {
			NSLog(@"%@ for %@", result, [self description]);
		}
		fContent = [result retain];
	}
}

- (NSError *) error {
	return ([fContent isKindOfClass:[NSError class]]) ? fContent : nil;
}

- (void) setError:(NSError *)error {
	NSLog(@"%@ for %@", error, [self description]);
	if (error != fContent) {
		[self willChangeValueForKey:@"content"];
		[fContent release];
		fContent = [error retain];
		[self didChangeValueForKey:@"content"];
	}
}

- (void) clear {
	if (self.content) {
		self.content = nil;
	} else {
		[fContent release];
		fContent = nil;
	}
}

- (void) dealloc {
	[fContent release];
	[super dealloc];
}

@end
